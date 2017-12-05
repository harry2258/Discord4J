/*
 *     This file is part of Discord4J.
 *
 *     Discord4J is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     Discord4J is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Lesser General Public License for more details.
 *
 *     You should have received a copy of the GNU Lesser General Public License
 *     along with Discord4J.  If not, see <http://www.gnu.org/licenses/>.
 */

package sx.blah.discord.handle.impl.events.guild.channel.message;

import sx.blah.discord.handle.obj.IMessage;

/**
 * Dispatched when the bot is @mentioned in a message.
 * <p>
 * <p>Note: When the bot is mentioned, this event is dispatched <b>as well as</b> {@link MessageReceivedEvent}.
 */
public class MentionEvent extends MessageEvent {

	public MentionEvent(IMessage message) {
		this(message.getChannel().getLongID(), message.getLongID());
	}

	public MentionEvent(long channelId, long messageId) {
		super(channelId, messageId);
	}
}
