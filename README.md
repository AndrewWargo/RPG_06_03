# RPG_pd06_3
RPG Project Mr. Holmes
Classes:
YoRPG - Tester -
This class will create of a series of attacks and moves that will test the 
abilities of the characters in this RPG series.

Character - The mother of all classes - 

The character initializes the basic attributes.
  HP, strength, defense, attackRating

The character has the ability to return the numbers associated with the 
defense, hp (in the form of a boolean determined by whether it is alive),
and can attack another character and lower its own hp.

A) Protagonist - herolike subclass of Character -

   The Protagonist re-evaluates character's attributes along with a new 
   attribute, name. 

   The Protagonist can "specialize" and "normalize" which will evaluate the 
   protagonist's defense and attackRatings. The getName will return the name 
   of the protagonist. 

   The toString will display all attributes that (look here for revisions) 
   the protagonist has.

   Subclasses (Different protagonist/hero classes):
    i)   Knight - Increased defense

    ii)  Mage - Increased attackRating

    iii) Warrior - Increased strength 

B) Monster - Enemies of Protagonist; subclass of Character -

     Monster sets new values for each attribute in Character.

   Methods:
     ~Currently none

   Subclasses:
     i)   Goblin - Increased strength

     ii)  Skeleton - Increased defense

     iii) Zombie - Increased HP