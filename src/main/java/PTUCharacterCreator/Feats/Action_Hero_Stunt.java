package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Action_Hero_Stunt extends Feature {
	{
		name = "Action Hero Stunt";
		tags = "";
		frequency = "Daily/10 - Free Action";
		effect = "Trigger: Your Pokemon makes a Skill Check for a dramatic, high risk action:   Instead of using a Skill for this Check, your Pokemon rolls their Cool Dice from Poffins and adds their number of Cool Dice from Stats as a modifier. For example, a Pokemon with 5d6 Cool from Poffins and 2d6 from Attack rolls 5d6+2. An example trigger is charging into a burning building for a heroic rescue. Skill Checks invoked by Intercepting attacks, Combat Maneuvers, Moves, and Abilities dont trigger this Feature.";
		prereqs.put("Cool Conduct Rank 1", -1);
	}
	public Action_Hero_Stunt(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cool Conduct Rank 1");
	}
}