package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Waters_Shroud extends Feature {
	{
		name = "Water's Shroud";
		tags = "[+Speed]";
		frequency = "Static";
		effect = "Choose Wash Away or Storm Drain. You gain the Chosen Ability.";
		prereqs.put("Call the Current Rank 2", -1);
	}
	public Waters_Shroud(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Call the Current Rank 2");
	}
}