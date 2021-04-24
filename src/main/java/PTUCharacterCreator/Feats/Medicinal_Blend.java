package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Medicinal_Blend extends Feature {
	{
		name = "Medicinal Blend";
		tags = "[Apothecary Research Field] [Branch]";
		frequency = "At-Will - Extended Action";
		effect = "Ingredients: Two Restoratives, or a Restorative and an X-Item Effect: You fuse the two Ingredients, creating an Item that has the properties of both. If you choose two Restoratives, they cannot be Restoratives with the same effect (you could not for example, mix a Potion and a Super Potion). If a Restorative Patch is used as an Ingredient, the resulting item can only be used as an Extended Action. Recipe - Performance Enhancers";
		prereqs.put("Apothecary", -1);
		prereqs.put("Med Edu", 6);
	}
	public Medicinal_Blend(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Apothecary") && t.checkSkillRank("Med Edu",6);
	}
}