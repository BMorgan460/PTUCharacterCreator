package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Brightest_Flame extends Feature {
	{
		name = "Brightest Flame";
		tags = "";
		frequency = "Static";
		effect = "Your Pokemons damaging Fire-Type Moves Burn their target on a roll of 18+. If a Move already has a chance to Burn a target, this Effect Range is instead increased by +3. Additionally, your Pokemons damaging Fire-Type Moves deal additional damage equal to your Type-Linked Skill Rank against Burned targets.";
		prereqs.put("Type Ace", -1);
		prereqs.put("Fire as Chosen Type", 0);
	}
	public Brightest_Flame(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Type Ace");
	}
}