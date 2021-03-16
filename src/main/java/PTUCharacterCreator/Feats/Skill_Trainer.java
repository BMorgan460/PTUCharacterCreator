package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Feature;
public class Skill_Trainer extends Feature {
	{
		name = "Skill Trainer";
		tags = "[Pokemon Caretaking Research Field] [Branch]";
		frequency = "At-Will - Free Action";
		effect = "Trigger: You Train your Pokemon Effect: For each of your Pokemon that has been Trained during this time, choose a Skill, that Skill becomes Pushed until an Extended Rest is taken. Pokemon rolls +1d6 with Pushed Skills, unless that would cause you to roll more than 6d6, if so, that Pokemon rolls with a +3 Bonus instead. A Pokemon may have only one Pushed Skill at a time.";
	}
	public Skill_Trainer(){}
}