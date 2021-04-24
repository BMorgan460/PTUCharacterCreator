package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Green_Path extends Feature {
	{
		name = "Green Path";
		tags = "[Special]";
		frequency = "Static";
		effect = "You gain the Naturewalk (Grassland) and Naturewalk (Forest) capabilities, and you are immune to Moves with the Powder keyword.";
		prereqs.put("Druid", -1);
	}
	public Green_Path(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Druid");
	}
}