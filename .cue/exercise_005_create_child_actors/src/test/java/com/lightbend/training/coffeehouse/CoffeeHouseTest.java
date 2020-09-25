package com.lightbend.training.coffeehouse;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.testkit.javadsl.TestKit;
import org.junit.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CoffeeHouseTest extends BaseAkkaTestCase {

  @Test
  public void shouldLogMessageWhenCreated() {
    new TestKit(system) {{
      interceptDebugLogMessage(".*[Oo]pen.*", 1, () -> system.actorOf(CoffeeHouse.props()));
    }};
  }

  @Test
  public void shouldCreateGuestActorsWhenCreateGuestMessageSent() {
    new TestKit(system) {{
      ActorRef coffeeHouse = system.actorOf(Props.create(CoffeeHouse.class), "create-guest");
      coffeeHouse.tell(CoffeeHouse.CreateGuest.Instance, ActorRef.noSender());
      expectActor(this, "/user/create-guest/$*");
    }};
  }
}


