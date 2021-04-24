package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Rule_of_Cool extends Feature {
	{
		name = "Rule of Cool";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Trigger: Your Pokemon uses a Cool-Type Move Contest Effect: Treat the Move as if it were one step more aligned with the Contest Type. If the Move would be opposing the Contest Type, it is instead neutral. If it is neutral, it is instead matching. You may activate this effect only once per Contest. Battle Effect: The triggering Moves Crit Range is increased by 3, and the Moves with the Priority or Interrupt Keywords may not be activated in reaction to this Move. You may activate Rule of Cool only once per Pokemon per Scene.";
		prereqs.put("Cool Conduct Rank 1", -1);
	}
	public Rule_of_Cool(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Cool Conduct Rank 1");
	}
}