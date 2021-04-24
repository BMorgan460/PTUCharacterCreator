package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Hunters_Reflexes extends Feature {
	{
		name = "Hunter's Reflexes";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "You and your Pokemon may make up to three Attacks of Opportunity each round, instead of only one. Additionally, your attacks always consider you to be adjacent to your target for the purposes of benefiting from your Pokemons Teamwork Ability, and count as Melee attacks for the purposes of triggering their Pack Hunt Ability.";
		prereqs.put("Hunter", -1);
		prereqs.put("Stealth", 4);
		prereqs.put("Survival", 4);
	}
	public Hunters_Reflexes(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Hunter") && t.checkSkillRank("Stealth",4) && t.checkSkillRank("Survival",4);
	}
}