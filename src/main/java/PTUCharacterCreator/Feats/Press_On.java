package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Press_On extends Feature {
	{
		name = "Press On!";
		tags = "";
		frequency = "Static";
		effect = "Your Hardened Pokemon gain the following benefits, based on your Intimidate Rank »» Expert: When your Pokemon Faints, you may pay 1 AP. If you do, your Pokemon Faints at -30% Hit Points instead. »» Master: While acting at 0 Hit Points or less, your Pokemons Critical Hit, Effect Range, Evasion, Initiative, Damage Reduction, and Resistance Bonuses from being Hardened are doubled.";
		prereqs.put("Taskmaster", -1);
		prereqs.put("Intimidate", 5);
	}
	public Press_On(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Taskmaster") && t.checkSkillRank("Intimidate",5);
	}
}