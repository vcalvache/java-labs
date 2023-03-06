package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CriticTest {

    @Test
    public void createCriticObjectTest(){
        Critic critic = new Critic();
        critic.setCriticName("Victor");
        System.out.println(critic.getCriticName());
        assertEquals("Victor", critic.getCriticName());
        assertNotEquals("Paco", critic.getCriticName());
    }
}
