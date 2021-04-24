package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Martial_Artist extends Feature {
	{
		name = "Martial Artist";
		tags = "[Class] [Special]";
		frequency = "Static";
		effect = "Choose one of the following abilities: Guts [+HP], Inner Focus [+Speed], Iron Fist [+Defense], Limber [+Speed], Reckless [+Attack], Technician [+Speed]. You gain the chosen Ability and its associated tag. Whenever you gain any Martial Artist Feature, you also gain the associated tag.";
		prereqs.put("Basic Martial Arts", -3);
		prereqs.put("Combat", 3);
	}
	public Martial_Artist(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasEdge("Basic Martial Arts") && t.checkSkillRank("Combat",3);
	}
}