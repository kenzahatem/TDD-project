package r5a08;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestUserGreating {

    @Test
    public void when_noun_is_correct(){
        //Arrange
        UserGreating g;
        g = new UserGreating();
        //Act
        String Actual = g.formatGreeting("Kenza") ;
        String Expected = "Bonjour , Kenza" ;

        //Assert
        assertThat(Actual).isEqualTo(Expected) ; 
    }
    @Test
    public void when_noun_has_more_than_10_letters(){
        //Arrange
        UserGreating g;
        g = new UserGreating();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            g.formatGreeting("KenzaClaudeCharlotte");
        });

        //Act
        String actualMessage = exception.getMessage();
        String Expected = "Nom invalid ! " ;
        //Assert
        assertTrue(actualMessage.contains(Expected));
    }


    @Test
    public void when_noun_contains_special_characters(){

        //Arrange
        UserGreating g;
        g = new UserGreating();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            g.formatGreeting("K'enza") ;
        });

        //Act
        String actualMessage = exception.getMessage();
        String Expected = "Nom invalid ! " ;
        //Assert
        assertTrue(actualMessage.contains(Expected));

    }

    @Test
    public void when_noun_contains_space(){

        //Arrange
        UserGreating g;
        g = new UserGreating();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            g.formatGreeting("K enza") ;
        });

        //Act
        String actualMessage = exception.getMessage();
        String Expected = "Nom invalid ! " ;
        //Assert
        assertTrue(actualMessage.contains(Expected));
    }
    @Test
    public void when_noun_is_Empty(){
        //Arrange
        UserGreating g;
        g = new UserGreating();
        Exception exception = assertThrows(RuntimeException.class, () -> {
            g.formatGreeting("") ;
        });

        //Act
        String actualMessage = exception.getMessage();
        String Expected = "Nom invalid ! " ;
        //Assert
        assertTrue(actualMessage.contains(Expected));

    }
}