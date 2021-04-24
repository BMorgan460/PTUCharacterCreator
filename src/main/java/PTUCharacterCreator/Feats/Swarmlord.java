package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Swarmlord extends Feature {
	{
		name = "Swarmlord";
		tags = "[Class] [Special]";
		frequency = "Static";
		effect = "Your powers begin to take after either Arachnid's Embrace or Monarch's Embrace. Depending on your Embrace, you gain an Ability and Stat Tags. Whenever you gain a Swarmlord Feature, you gain the same Stat Tags. Arachnids Embrace: Unnerve [+Attack] Monarchs Embrace: Shield Dust [+Special Attack]";
		prereqs.put("Elemental Connection (Bug)", 0);
		prereqs.put("Survival", 3);
		prereqs.put("Command", 3);
	}
	public Swarmlord(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Survival",3) && t.checkSkillRank("Command",3);
	}
}