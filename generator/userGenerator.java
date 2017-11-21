/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Stillmen Vallian
 */
public class meetingGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 100000; i++) {
            System.out.println("{\n" +
"      \"id\": "+i+",\n" +
"      \"title\": \"meeting "+i+"\",\n" +
"      \"agenda\": \"agenda meeting "+i+"\",\n" +
"      \"location\": \"ruang "+i+"\",\n" +
"      \"duration\": 1,\n" +
"      \"proposed_date_range\": {\n" +
"         \"date_start\":1483290"+(i*10000)+",\n" +
"         \"date_end\": 1483722"+(i*10000)+"\n" +
"      },\n" +
"      \"negotiation_deadline\": 1483203600000,\n" +
"      \"participants\": [\n" +
"         \"user"+i+"@ms.com\"\n" +
"      ],\n" +
"      \"important_participants\": [\n" +
"         \"user"+(i+1)+"@ms.com\"\n" +
"      ],\n" +
"      \"status\": \"running\",\n" +
"      \"agreed_time\": {\n" +
"         \"date_start\": 1483290"+(i*10000)+",\n" +
"         \"date_end\": 1483722"+(i*10000)+"\n" +
"      },\n" +
"      \"pastDeadline\": null\n" +
"   },");
    }
    
}