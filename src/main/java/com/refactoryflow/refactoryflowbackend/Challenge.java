package com.refactoryflow.refactoryflowbackend;

import javax.persistence.*;

@Entity
@Table(name = "challenge")
public class Challenge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long Id;

    @Column(name = "name")
    private String Name;
    @Column(name = "subject")
    private String Subject;
    @Column(name = "difficulty")
    private String Difficulty;
    @Column(name = "duration")
    private int Duration;

    public long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getDifficulty() {
        return Difficulty;
    }

    public void setDifficulty(String difficulty) {
        Difficulty = difficulty;
    }

    public int getDuration() {
        return Duration;
    }

    public void setDuration(int duration) {
        Duration = duration;
    }

    public Challenge(long id, String name, String subject, String difficulty, int duration) {
        Id = id;
        Name = name;
        Subject = subject;
        Difficulty = difficulty;
        Duration = duration;
    }

    public Challenge() {
    }
}
