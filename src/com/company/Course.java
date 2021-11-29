package com.company;

public class Course
{
    //methods
    public Course (String name, String topic, String teacher, int participants)
    {
        this.name = name;
        this.topic = topic;
        this.teacher = teacher;
        this.participants = participants;
    }

    public String toString ()
    {
        return name + ", " + topic + " (teacher: " + teacher + ", participants: " + participants + ")";
    }

    public String getName() {return name;}
    public void setName (String name) {this.name = name;}

    public String getTopic() {return topic; }
    public void setTopic (String topic) {this.topic = topic;}

    public String getTeacher() {return teacher;}
    public void setTeacher (String teacher) {this.teacher = teacher;}

    public int getParticipants() {return participants;}
    public void setParticipants (int participants)
    {
        this.participants = participants;
        if (participants < 0)
            System.out.println ("Negative number of participants.");
    }

   public boolean hasParticipants (Course course)
   {
       return course.getParticipants() <= 0;
   }

    //fields
    private String name;
    private String topic;
    private String teacher;
    private int participants;
}
