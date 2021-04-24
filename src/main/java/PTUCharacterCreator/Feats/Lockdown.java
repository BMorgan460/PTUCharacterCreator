package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Lockdown extends Feature {
	{
		name = "Lockdown";
		tags = "";
		frequency = "At-Will - Free Action";
		effect = "Trigger: Your Pokemons Damaging Electric Attack would inflict Paralysis on an already Paralyzed foe Effect: For 1 full round, that foe is instead Stuck and may only use At-Will Frequency Moves.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Electric as Chosen Type", 0);
	}
	public Lockdown(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}