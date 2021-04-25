package PTUCharacterCreator.Moves;
import PTUCharacterCreator.Move;
public class Perish_Song extends Move {
	{
		name = "Perish Song";
		effect = "Perish Song cannot miss. All targets, including the user, receive a Perish Count of 3. At the beginning of each of the target’s turns, their Perish count is lowered by 1. Once a Perish Count reaches 0, set the Pokemon’s Hit Points to 0. A Perish Count disappears if a target returns to their Poke Ball, Takes a Breather, or is knocked out. Perish Song never causes Massive Damage.";
		damageBase = 0;
		mDamageBase = 0;
		AC = 0;
		frequency = "Daily";
		range = "Burst 15, Sonic";
		type = "Normal";
		category = "Status";
	}
	public Perish_Song(){}
}