package PTUCharacterCreator.Edges;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Edge;
public class Green_Thumb extends Edge {
	{
		name = "Green Thumb";
		effect = "You know how to grow Apricorns and Tier 1 Berries using a Portable Grower or Fertilized Soil.";
		prereqs.put("Gen Edu or Survival", 3);
	}
	public Green_Thumb(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.checkSkillRank("Gen Edu",3) || t.checkSkillRank("Survival",3);
	}
}