package fr.kyloren3600.kingdoms.events.war;

import fr.kyloren3600.kingdoms.war.WarPlayer;

public class WarJoinedEvent extends WarPlayerEvent {
	public WarJoinedEvent(WarPlayer warPlayer) {
		super(warPlayer);
	}
}