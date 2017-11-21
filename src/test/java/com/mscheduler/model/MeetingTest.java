/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mscheduler.model;

import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Type.String;
import java.util.Date;
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
public class MeetingTest {
    
    public MeetingTest() {
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
     * Test of toString method, of class Meeting.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Meeting instance = new Meeting();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of isPastDeadline method, of class Meeting.
     */
    @Test
    public void testIsPastDeadline() {
        System.out.println("isPastDeadline");
        Meeting instance = new Meeting(0, null, null, null, 0, null, null, null, null, null, null, false);
        boolean expResult = false;
        boolean result = instance.isPastDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of isImportantParticipant method, of class Meeting.
     */
    @Test
    public void testIsImportantParticipant() {
        System.out.println("isImportantParticipant");
        String email = "";
        Meeting instance = new Meeting(0, null, null, null, 0, null, null, null, null, null, null, false);
        boolean expResult = false;
        boolean result = instance.isImportantParticipant(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of isNormalParticipant method, of class Meeting.
     */
    @Test
    public void testIsNormalParticipant() {
        System.out.println("isNormalParticipant");
        String email = "";
        Meeting instance = new Meeting(0, null, null, null, 0, null, null, null, null, null, null, false);
        boolean expResult = false;
        boolean result = instance.isNormalParticipant(email);
        assertEquals(expResult, result);
    }

    /**
     * Test of getId method, of class Meeting.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        Meeting instance = new Meeting();
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of setId method, of class Meeting.
     */
    @Test
    public void testSetId() {
        System.out.println("setId");
        int id = 0;
        Meeting instance = new Meeting();
        instance.setId(id);
        System.out.println("getId");
        int expResult = 0;
        int result = instance.getId();
        assertEquals(expResult, result);
    }

    /**
     * Test of getTitle method, of class Meeting.
     */
    @Test
    public void testGetTitle() {
        System.out.println("getTitle");
        Meeting instance = new Meeting();
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of setTitle method, of class Meeting.
     */
    @Test
    public void testSetTitle() {
        System.out.println("setTitle");
        String title = "";
        Meeting instance = new Meeting();
        instance.setTitle(title);
        
        System.out.println("getTitle");
        String expResult = "";
        String result = instance.getTitle();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAgenda method, of class Meeting.
     */
    @Test
    public void testGetAgenda() {
        System.out.println("getAgenda");
        Meeting instance = new Meeting();
        String expResult = "";
        String result = instance.getAgenda();
        assertEquals(expResult, result);
    }

    /**
     * Test of getPastDeadline method, of class Meeting.
     */
    @Test
    public void testGetPastDeadline() {
        System.out.println("getPastDeadline");
        Meeting instance = new Meeting();
        Boolean expResult = null;
        Boolean result = instance.getPastDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of setPastDeadline method, of class Meeting.
     */
    @Test
    public void testSetPastDeadline() {
        System.out.println("setPastDeadline");
        Boolean pastDeadline = null;
        Meeting instance = new Meeting();
        instance.setPastDeadline(pastDeadline);
        
        System.out.println("getPastDeadline");
        //Meeting instance = new Meeting();
        Boolean expResult = null;
        Boolean result = instance.getPastDeadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAgenda method, of class Meeting.
     */
    @Test
    public void testSetAgenda() {
        System.out.println("setAgenda");
        String agenda = "";
        Meeting instance = new Meeting();
        instance.setAgenda(agenda);
        
        System.out.println("getAgenda");
        //Meeting instance = new Meeting();
        String expResult = "";
        String result = instance.getAgenda();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLocation method, of class Meeting.
     */
    @Test
    public void testGetLocation() {
        System.out.println("getLocation");
        Meeting instance = new Meeting();
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLocation method, of class Meeting.
     */
    @Test
    public void testSetLocation() {
        System.out.println("setLocation");
        String location = "";
        Meeting instance = new Meeting();
        instance.setLocation(location);
        
        System.out.println("getLocation");
        String expResult = "";
        String result = instance.getLocation();
        assertEquals(expResult, result);
    }

    /**
     * Test of getDuration method, of class Meeting.
     */
    @Test
    public void testGetDuration() {
        System.out.println("getDuration");
        Meeting instance = new Meeting();
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }

    /**
     * Test of setDuration method, of class Meeting.
     */
    @Test
    public void testSetDuration() {
        System.out.println("setDuration");
        int duration = 0;
        Meeting instance = new Meeting();
        instance.setDuration(duration);
        
        System.out.println("getDuration");
        int expResult = 0;
        int result = instance.getDuration();
        assertEquals(expResult, result);
    }

    /**
     * Test of getProposed_date_range method, of class Meeting.
     */
    @Test
    public void testGetProposed_date_range() {
        System.out.println("getProposed_date_range");
        Meeting instance = new Meeting();
        DateRange expResult = null;
        DateRange result = instance.getProposed_date_range();
        assertEquals(expResult, result);
    }

    /**
     * Test of setProposed_date_range method, of class Meeting.
     */
    @Test
    public void testSetProposed_date_range() {
        System.out.println("setProposed_date_range");
        DateRange proposed_date_range = null;
        Meeting instance = new Meeting();
        instance.setProposed_date_range(proposed_date_range);
    
        System.out.println("getProposed_date_range");
        DateRange expResult = null;
        DateRange result = instance.getProposed_date_range();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNegotiation_deadline method, of class Meeting.
     */
    @Test
    public void testGetNegotiation_deadline() {
        System.out.println("getNegotiation_deadline");
        Meeting instance = new Meeting();
        Date expResult = null;
        Date result = instance.getNegotiation_deadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of setNegotiation_deadline method, of class Meeting.
     */
    @Test
    public void testSetNegotiation_deadline() {
        System.out.println("setNegotiation_deadline");
        Date negotiation_deadline = null;
        Meeting instance = new Meeting();
        instance.setNegotiation_deadline(negotiation_deadline);
        
        System.out.println("getNegotiation_deadline");
        Date expResult = null;
        Date result = instance.getNegotiation_deadline();
        assertEquals(expResult, result);
    }

    /**
     * Test of getParticipants method, of class Meeting.
     */
    @Test
    public void testGetParticipants() {
        System.out.println("getParticipants");
        Meeting instance = new Meeting();
        List<String> expResult = null;
        List<String> result = instance.getParticipants();
        assertEquals(expResult, result);
    }

    /**
     * Test of setParticipants method, of class Meeting.
     */
    @Test
    public void testSetParticipants() {
        System.out.println("setParticipants");
        List<String> participants = null;
        Meeting instance = new Meeting();
        instance.setParticipants(participants);
        
        System.out.println("getParticipants");
        List<String> expResult = null;
        List<String> result = instance.getParticipants();
        assertEquals(expResult, result);
    }

    /**
     * Test of getImportant_participants method, of class Meeting.
     */
    @Test
    public void testGetImportant_participants() {
        System.out.println("getImportant_participants");
        Meeting instance = new Meeting();
        List<String> expResult = null;
        List<String> result = instance.getImportant_participants();
        assertEquals(expResult, result);
    }

    /**
     * Test of setImportant_participants method, of class Meeting.
     */
    @Test
    public void testSetImportant_participants() {
        System.out.println("setImportant_participants");
        List<String> important_participants = null;
        Meeting instance = new Meeting();
        instance.setImportant_participants(important_participants);
        
        System.out.println("getImportant_participants");
        List<String> expResult = null;
        List<String> result = instance.getImportant_participants();
        assertEquals(expResult, result);
    }

    /**
     * Test of getStatus method, of class Meeting.
     */
    @Test
    public void testGetStatus() {
        System.out.println("getStatus");
        Meeting instance = new Meeting();
        MeetingStatus expResult = null;
        MeetingStatus result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of setStatus method, of class Meeting.
     */
    @Test
    public void testSetStatus() {
        System.out.println("setStatus");
        MeetingStatus status = null;
        Meeting instance = new Meeting();
        instance.setStatus(status);
        
        System.out.println("getStatus");
        MeetingStatus expResult = null;
        MeetingStatus result = instance.getStatus();
        assertEquals(expResult, result);
    }

    /**
     * Test of getAgreed_time method, of class Meeting.
     */
    @Test
    public void testGetAgreed_time() {
        System.out.println("getAgreed_time");
        Meeting instance = new Meeting();
        DateRange expResult = null;
        DateRange result = instance.getAgreed_time();
        assertEquals(expResult, result);
    }

    /**
     * Test of setAgreed_time method, of class Meeting.
     */
    @Test
    public void testSetAgreed_time() {
        System.out.println("setAgreed_time");
        DateRange agreed_time = null;
        Meeting instance = new Meeting();
        instance.setAgreed_time(agreed_time);
        
        System.out.println("getAgreed_time");
        DateRange expResult = null;
        DateRange result = instance.getAgreed_time();
        assertEquals(expResult, result);
    }
    
}
