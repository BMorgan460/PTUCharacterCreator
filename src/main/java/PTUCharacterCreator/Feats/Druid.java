package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Druid extends Feature {
	{
		name = "Druid";
		tags = "[Class] [Special]";
		frequency = "Static";
		effect = "Your powers begin to take after either Flowers, Fungi, or Trees. Depending on your oath, you gain an Ability and Stat Tags. Whenever you gain a Druid Feature, you gain the same Stat Tags. Flower Oath: Aroma Veil [+Special Attack] Fungal Oath: Effect Spore [+Special Defense] Wood Oath: Life Force [+Attack]";
		prereqs.put("Elemental Connection (Grass)", 0);
		prereqs.put("Survival", 3);
		prereqs.put("Gen Edu", 3);
	}
	public Druid(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Survival",3) && t.checkSkillRank("Gen Edu",3);
	}
}