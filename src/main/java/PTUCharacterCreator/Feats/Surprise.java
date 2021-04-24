package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Surprise extends Feature {
	{
		name = "Surprise!";
		tags = "[+Speed]";
		frequency = "X AP - Swift Action";
		effect = "Trigger: You make an attack against a foe that does not anticipate an attack or is adjacent to your Pokemon with Pack Hunt or Teamwork Effect: Make two attack rolls for the triggering action, and use the better result to finalize the attack. If both attacks would hit, the target is Flinched. Surprise! may be used only once per Scene per target. If the triggering attack was a Poke Ball, Hand Net, Weighted Net, Glue Cannon, or Struggle Attack, Surprise! costs 1 AP to activate, otherwise, it costs 2 AP. May Playtest Errata: If the triggering attack was a Cap Cannon, Surprise! costs 1 AP to activate.";
		prereqs.put("Hunter", -1);
		prereqs.put("Stealth", 4);
		prereqs.put("Survival", 4);
	}
	public Surprise(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hunter") && t.checkSkillRank("Stealth",4) && t.checkSkillRank("Survival",4);
	}
}