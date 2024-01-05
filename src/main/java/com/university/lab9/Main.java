package com.university.lab9;

public class Main {
    public static void main(String[] args) {
        DataEP[] dataEndpoints = {
                new DataEP("/countries", "countries", "countries", ""),
                new DataEP("/cities", "cities", "cities", ""),
                new DataEP("/districts", "districts", "kyiv_districts", "&city_id=216"),
                new DataEP("/street/allstreets", "streets", "all_streets", ""),
                new DataEP("/street/streets", "streets", "kyiv_streets", "&city_id=216"),
                new DataEP("/metro/stations", "metro_stations", "kyiv_metro_stations", "&city_id=216"),
                new DataEP("/routes/bycity", "routes", "kyiv_routes", "&city_id=216")
        };

        for (DataEP endpoint : dataEndpoints) {
            String jsonResponse = callApiAndHandleExceptions(endpoint.getEndpoint(), endpoint.getArguments());
            convertJsonToExcelAndHandleExceptions(jsonResponse, "sheet", endpoint.getKey(), endpoint.getSheetName());
        }
    }

    private static String callApiAndHandleExceptions(String endpoint, String arguments) {
        try {
            String jsonResponse = MyApi.runApi(endpoint, arguments);
            System.out.println(jsonResponse);
            return jsonResponse;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static void convertJsonToExcelAndHandleExceptions(String jsonResponse, String filename, String dataArrayKey, String sheetName) {
        if (jsonResponse != null) {
            try {
                JsonToExcel.Convert(jsonResponse, filename, dataArrayKey, sheetName);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
