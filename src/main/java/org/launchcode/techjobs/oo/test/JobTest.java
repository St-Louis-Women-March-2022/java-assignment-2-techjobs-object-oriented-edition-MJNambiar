package org.launchcode.techjobs.oo.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.runners.MethodSorters;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
@FixMethodOrder (MethodSorters.NAME_ASCENDING)
public class JobTest {

//Order of tests executing with job with constructor first so id=1, so need to use @FixMethodOrder
    //ask if this is the best way in office hours

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
//        System.out.println("Job1" + job1.getId());

        assertEquals(1, job1.getId(), .001);
        assertEquals("Product tester", job1.getName());
        assertEquals("ACME", job1.getEmployer().getValue());
        assertEquals("Desert", job1.getLocation().getValue());
        assertEquals("Quality control", job1.getPositionType().getValue());
        assertEquals("Persistence", job1.getCoreCompetency().getValue());
//        System.out.println(job1.getEmployer());
//        System.out.println(job1.getEmployer().getValue());
//        Ask why these are different in office hours?

        assertTrue(job1 instanceof Job);
        assertTrue(job1.getEmployer() instanceof Employer);
        assertTrue(job1.getLocation() instanceof Location);
        assertTrue(job1.getPositionType() instanceof PositionType);
        assertTrue(job1.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testSettingJobId() {
        Job job4 = new Job();
        Job job5 = new Job();
//        System.out.println("Job4" + job4.getId());
//        System.out.println("Job5" + job5.getId());
        assertEquals(4, job4.getId(), .001);
        assertEquals(5, job5.getId(), .001);
    }

    @Test
    public void testJobsForEquality() {
        Job job2 = new Job();
        Job job3 = new Job();
        assertFalse(job2.equals(job3));
//        System.out.println("Job2" + job2.getId());
//        System.out.println("Job3" + job3.getId());
    }
}
