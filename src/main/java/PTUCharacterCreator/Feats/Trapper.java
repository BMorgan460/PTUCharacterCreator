package PTUCharacterCreator.Feats;
import PTUCharacterCreator.Trainer;
import PTUCharacterCreator.Feature;
public class Trapper extends Feature {
	{
		name = "Trapper";
		tags = "[+HP]";
		frequency = "Daily x2 - Extended Action";
		effect = "You create a consumable item that creates 8 meters of Hazard within 6 meters. All 8 meters must be adjacent with at least one other space of the Hazard. These Hazards cause foes that run into them to become Slowed until the end of their next turn and have an additional effect based on the terrain in which the item was made. When foes run into these Hazards, they are destroyed after their effects resolve. Pokemon and Trainers with Naturewalk for the terrains associated with a Hazard are immune to its effects. These items must be used the same day they are created or they lose all effect. »» Dust Trap - Grassland or Desert: A foe that runs into this Hazard is Blinded until the end of their next turn. »» Tangle Trap - Forest or Wetlands: A foe that runs into this Hazard is must immediately stop Shifting, and they are Stuck instead of Slowed until the end of their next turn. »» Slick Trap - Ocean or Tundra: A foe that runs into this Hazard becomes Vulnerable until the end of their next Turn. »» Abrasion Trap - Mountain, Cave, or Urban: A foe that runs into this Hazard lowers their Defense and Special Defense by 1 Combat Stage.";
		prereqs.put("Survivalist", -1);
		prereqs.put("Survival", 4);
	}
	public Trapper(){}
	@Override
	public boolean checkPrereqs(Trainer t) {
		return t.hasFeat("Survivalist") && t.checkSkillRank("Survival",4);
	}
}