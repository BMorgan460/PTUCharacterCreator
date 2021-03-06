package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Shocking_Speed extends Feature {
	{
		name = "Shocking Speed";
		tags = "";
		frequency = "Scene x2 - Free Action";
		effect = "You may activate this Feature to have your Electric-Type Pokemon may use an Electric-Type Move with a Frequency of At-Will as if it had Priority (Advanced).";
		prereqs.put("Lockdown", -1);
		prereqs.put("Type-Linked Skill at Expert", 0);
	}
	public Shocking_Speed(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Lockdown");
	}
}