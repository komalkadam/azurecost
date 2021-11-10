package com.hitachivantara.multicloud.providercost.azure.azurecost;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.identity.ClientSecretCredential;
import com.azure.identity.ClientSecretCredentialBuilder;
import com.azure.resourcemanager.costmanagement.CostManagementManager;
import com.azure.resourcemanager.costmanagement.models.ExportType;
import com.azure.resourcemanager.costmanagement.models.FunctionType;
import com.azure.resourcemanager.costmanagement.models.GranularityType;
import com.azure.resourcemanager.costmanagement.models.QueryAggregation;
import com.azure.resourcemanager.costmanagement.models.QueryColumn;
import com.azure.resourcemanager.costmanagement.models.QueryColumnType;
import com.azure.resourcemanager.costmanagement.models.QueryDataset;
import com.azure.resourcemanager.costmanagement.models.QueryDefinition;
import com.azure.resourcemanager.costmanagement.models.QueryGrouping;
import com.azure.resourcemanager.costmanagement.models.QueryResult;
import com.azure.resourcemanager.costmanagement.models.TimeframeType;

@SpringBootApplication
public class AzurecostApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzurecostApplication.class, args);
		AzureProfile profile = new AzureProfile("18791e17-6159-4f52-a8d4-de814ca8284a", "38713a6f-be7b-4707-bc26-e2028cb98e0d", AzureEnvironment.AZURE);
		ClientSecretCredential clientSecretCredential = new ClientSecretCredentialBuilder()
		            .clientId("c57e2d5e-ab71-4827-b270-f77c379e2b61")
		            .clientSecret("TUEhFmdORiBCj32.qWSo~o51V-89IC1.BT")
		            .tenantId("18791e17-6159-4f52-a8d4-de814ca8284a")
		            .build();
		
		CostManagementManager manager = CostManagementManager
			    .authenticate(clientSecretCredential, profile);
		
		QueryDefinition parameters = new QueryDefinition().
				withType(ExportType.ACTUAL_COST).
				withTimeframe(TimeframeType.THE_LAST_MONTH).withDataset( new QueryDataset()
                        .withGranularity(GranularityType.fromString("None"))
                        .withAggregation(
                            mapOf(
                                "totalCost",
                                new QueryAggregation().withName("PreTaxCost").withFunction(FunctionType.SUM)))
                        .withGrouping(
                            Arrays
                                .asList(
                                    new QueryGrouping()
                                        .withType(QueryColumnType.DIMENSION)
                                        .withName("ResourceGroup"))));
		QueryResult result = manager.queries().usage("subscriptions/38713a6f-be7b-4707-bc26-e2028cb98e0d", parameters);
		
		List<QueryColumn> columns = result.columns();
		for (int i=0; i < columns.size(); i++) {
			QueryColumn column = columns.get(i);
			
			System.out.print(column.name() + "\t\t");
		}
		System.out.print("\n");
		List<List<Object>> rows = result.rows();
		for (List<Object> row : rows) {
			for (int i=0; i < row.size(); i++) {
				//QueryColumn column = columns.get(i);
				//column.type();
				System.out.print(row.get(i)+"\t");
				
			}
			System.out.print("\n");
		}
		//for (QueryColumn column : result.columns())
       
		
		
	}
	@SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }

}
