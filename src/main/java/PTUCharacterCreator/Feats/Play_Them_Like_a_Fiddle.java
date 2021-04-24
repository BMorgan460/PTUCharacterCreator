package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Play_Them_Like_a_Fiddle extends Feature {
	{
		name = "Play Them Like a Fiddle";
		tags = "[+Speed]";
		frequency = "Scene x3 - Swift Action";
		effect = "Trigger: You hit with Leer, Confide, Baby-Doll Eyes, or a Provocateur Move Effect: The Move gains additional effects as listed below. You may use the effects of each Move only once per Scene. »» Baby-Doll Eyes: The target becomes Infatuated with you for the rest of the Scene, and cannot be cured of this condition by any means, including Taking a Breather. This does not bypass immunity to Infatuation. »» Confide: You choose a Move the target has used this Scene. That Move becomes Disabled for the target. »» Leer: The targets Defense is lowered an additional Combat Stage, and their Special Defense is lowered by 2 Combat Stages. »» Sweet Kiss: While the target is Confused, they may not perform Disengage Maneuvers, and whenever they hit themselves in Confusion, they provoke an Attack of Opportunity from all of their adjacent foes. »» Taunt: For 1 full round, the next damaging attack to hit the target of Taunt deals +3d8+10 Damage. »» Torment: The targets Ability is disabled until the end of the encounter. If the target has more than one Ability, you choose one of them to disable. »» Lovely Kiss: The targets Evasion is lowered by 2 for the rest of the Scene.";
		prereqs.put("Powerful Motivator", -1);
		prereqs.put("a Provocateur Skill at Expert Rank", 0);
	}
	public Play_Them_Like_a_Fiddle(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
            String[] s = {"Charm", "Guile", "Intimidate"};
		return t.hasFeat("Powerful Motivator") && checkMultipleSkills(t,s,5,1);
	}
}