package r5a08;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

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
        //Act
        String Actual = g.formatGreeting("KenzaClaudeCharlotte") ;
        String Expected = "Nom invalid ! " ;

        //Assert
        assertThat(Actual).isEqualTo(Expected) ;
    }


    @Test
    public void when_noun_contains_special_characters(){
        //Arrange
        UserGreating g;
        g = new UserGreating();

        //Act
        String Actual = g.formatGreeting("K'enza") ;
        String Expected = "Nom invalid ! " ;

        //Assert
        assertThat(Actual).isEqualTo(Expected) ;

    }

    @Test
    public void when_noun_contains_space(){
        //Arrange
        UserGreating g;
        g = new UserGreating();
        //Act
        String Actual = g.formatGreeting("K enza") ;
        String Expected = "Nom invalid ! " ;

        //Assert
        assertThat(Actual).isEqualTo(Expected) ;

    }
    @Test
    public void when_noun_is_Empty(){
        //Arrange
        UserGreating g;
        g = new UserGreating();
        //Act
        String Actual = g.formatGreeting("") ;
        String Expected = "Nom invalid ! " ;

        //Assert
        assertThat(Actual).isEqualTo(Expected) ;

    }
}