/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import java.util.ArrayList;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Prayogo Cendra
 */
public class InvitationTest {
    
    public InvitationTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setMeeting_id method, of class Invitation.
     */
    @Test
    public void testSetMeeting_id() {
        System.out.println("setMeeting_id");
        int meeting_id = 1000;
        Invitation instance = new Invitation();
        instance.setMeeting_id(meeting_id);
        int result = instance.getMeeting_id();
        try{
            assertEquals(meeting_id, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
        
        meeting_id = 0;
        instance.setMeeting_id(meeting_id);
        result = instance.getMeeting_id();
        try{
            assertEquals(meeting_id, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
        
        meeting_id = -1;
        instance.setMeeting_id(meeting_id);
        result = instance.getMeeting_id();
        try{
            assertEquals(meeting_id, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }

    /**
     * Test of setTo method, of class Invitation.
     */
    @Test
    public void testSetTo() {
        System.out.println("setTo");
        String to = "abcde@mail.com";
        Invitation instance = new Invitation();
        instance.setTo(to);
        String result = instance.getTo();
        try{
            assertEquals(to, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }

    /**
     * Test of setAvailability method, of class Invitation.
     */
    @Test
    public void testSetAvailability() {
        System.out.println("setAvailability");
        List<DateRange> availability = new ArrayList<DateRange>();
        availability.add(new DateRange("01/01/2017 - 01/06/2017"));
        Invitation instance = new Invitation();
        instance.setAvailability(availability);
        List<DateRange> result = instance.getAvailability();
        try{
            assertEquals(availability, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }

    /**
     * Test of addAvailability method, of class Invitation.
     */
    @Test
    public void testAddAvailability() {
        System.out.println("addAvailability");
        DateRange newDateRange = new DateRange("02/06/2017 - 31/12/2017");
        Invitation instance = new Invitation(1, "aabc@mail.com");
        List<DateRange> expectedResult = instance.getAvailability();
        expectedResult.add(newDateRange);
        instance.addAvailability(newDateRange);
        List<DateRange> result = instance.getAvailability();
        // TODO review the generated test code and remove the default call to fail.
        try{
            assertEquals(expectedResult, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }


    /**
     * Test of setStatus method, of class Invitation.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        InvitationStatus status = InvitationStatus.accepted;
        Invitation instance = new Invitation();
        instance.setStatus(status);
        InvitationStatus result = instance.getStatus();
        try{
            assertEquals(status, result);
        }catch(Exception e){
            System.out.println("Tidak sesuai dengan ekspetasi");
        }
    }
    
}
