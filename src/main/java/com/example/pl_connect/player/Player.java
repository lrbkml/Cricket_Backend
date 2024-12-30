package com.example.pl_connect.player;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "ipl_players")
@Data // Generates getters, setters, toString, equals, and hashCode
@NoArgsConstructor // Generates a no-argument constructor
@AllArgsConstructor // Generates a constructor with all fields
public class Player {
    @Id
    @Column(name = "name", unique = true)
    private String name;

    private String nation;
    private String pos;
    private Integer age;
    private Integer mp;
    private Integer innings;
    private Integer run;
    private Integer ball;
    private Integer highest;
    private Float sr;
    private Float average;
    private Integer notout;
    private Integer fours;
    private Integer six;
    private Integer duck;
    private Integer fifty;
    private Integer hundred;
//    private Integer twoHundred;
    private Integer wicket_taken;
    private Integer ball_delivered;
    private Integer run_as_bowler;
    private Integer maiden;
    private Integer average_ball; //average as bowler;
    private Integer economy; //ball economy
    private Integer sr_ball; //strike rate of as bowler;
    private Integer fourwicket; //four wicket taken as bowler;
    private Integer plusfourwicket; //more than four wicket taken as bowler;
//    private Double minutesPlayed; //total minutes played in IPL as a player ;
    private String team; // which team he has played ;

    public Player(String name) {
        this.name = name;
    }
}
