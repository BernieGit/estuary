package com.neighborhood.aka.laplace.estuary.core.akka

import akka.actor.ActorSystem

/**
  * Created by john_liu on 2018/2/1.
  */
trait theActorSystem {
 val system = ActorSystem("Estuary")

}
