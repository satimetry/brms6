package com.satimetry.fifo;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Goal implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label(value = "User ID")
   private int userid;
   @org.kie.api.definition.type.Label(value = "Goal Name")
   private java.lang.String goalname;
   @org.kie.api.definition.type.Label(value = "Target")
   private int target;
   @org.kie.api.definition.type.Label(value = "Start")
   private int start;
   @org.kie.api.definition.type.Label(value = "Low")
   private int low;
   @org.kie.api.definition.type.Label(value = "High")
   private int high;

   public Goal()
   {
   }

   public int getUserid()
   {
      return this.userid;
   }

   public void setUserid(int userid)
   {
      this.userid = userid;
   }

   public java.lang.String getGoalname()
   {
      return this.goalname;
   }

   public void setGoalname(java.lang.String goalname)
   {
      this.goalname = goalname;
   }

   public int getTarget()
   {
      return this.target;
   }

   public void setTarget(int target)
   {
      this.target = target;
   }

   public int getStart()
   {
      return this.start;
   }

   public void setStart(int start)
   {
      this.start = start;
   }

   public int getLow()
   {
      return this.low;
   }

   public void setLow(int low)
   {
      this.low = low;
   }

   public int getHigh()
   {
      return this.high;
   }

   public void setHigh(int high)
   {
      this.high = high;
   }

   public Goal(int userid, java.lang.String goalname, int target, int start,
         int low, int high)
   {
      this.userid = userid;
      this.goalname = goalname;
      this.target = target;
      this.start = start;
      this.low = low;
      this.high = high;
   }

}