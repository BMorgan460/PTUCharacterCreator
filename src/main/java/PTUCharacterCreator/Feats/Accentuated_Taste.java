package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Accentuated_Taste extends Feature {
	{
		name = "Accentuated Taste";
		tags = "";
		frequency = "Static";
		effect = "Whenever you create a Snack with a Chef Feature, you may assign it a Taste chosen from Salty, Sour, Spicy, Dry, and Sweet. Tasty Snacks must be assigned their corresponding Taste. Whenever a Pokemon trades in a Digestion/Food Buff from a Snack with an assigned Taste they do not dislike, they gain one of the following bonuses based on the assigned Taste: »» Salty: The user gains 5 Temporary Hit Points. This stacks with any Temporary Hit Points gained through Chef Features, the Lunchbox Ability, and the Digestion/Food Buff. »» Spicy: Increase the users Critical Hit Range by 1. »» Sour: Increase the users Evasion against damaging attacks by 1. »» Dry: Increase the users Effect Range of all attacks by 1. »» Bitter: The user gets a +1 Bonus to all Save Checks. »» Sweet: Increase the users Initiative by 5. May Playtest Errata: This bonus can only be gained once per item, even if Complex Aftertaste is used to give an additional Digestion/Food Buff for the item. Recipe - Preserves";
		prereqs.put("Chef", -1);
		prereqs.put("Intuition", 4);
	}
	public Accentuated_Taste(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Chef") && t.checkSkillRank("Intuition",4);
	}
}