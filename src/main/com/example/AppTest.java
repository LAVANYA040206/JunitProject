package com.example;
import org.Junit.Test;
import org.junit.Assert.*;

public class AppTest {
    
        @Test
        public void AppTests(){
            App app=new App();
            assertEquals(6,app.mul(2,3));      
          }
      }

