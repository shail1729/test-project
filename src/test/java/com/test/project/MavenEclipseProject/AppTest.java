package com.test.project.MavenEclipseProject;

import com.test.project.MavenEclipseProject.*;
import static org.junit.Assert.assertEquals;
 
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
/**
 * Hello world!
 *
 */
@RunWith(JUnit4.class)
public class AppTest 
{
    
@Test
 public void testAdd(){

assertEquals(6, App.add(1,4));;
}
}
