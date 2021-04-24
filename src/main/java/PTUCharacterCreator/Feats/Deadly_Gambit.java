package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Deadly_Gambit extends Feature {
	{
		name = "Deadly Gambit";
		tags = "";
		frequency = "Scene - Free Action";
		effect = "Trigger: Your Pokemon is the target of a foes damaging melee attack Effect: The triggering attack automatically hits as if it was a Critical Hit. Before damage resolves, your Pokemon may use a 1-Target damaging attack on the foe making the triggering attack as an Interrupt, Frequency allowing, and also automatically hits as a Critical Hit. Damage for both attacks then resolve at the same time.";
		prereqs.put("5 Taskmaster Features", 0);
		prereqs.put("Intimidate", 6);
	}
	public Deadly_Gambit(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Intimidate",6) && t.hasFeat("Taskmaster");
	}
}