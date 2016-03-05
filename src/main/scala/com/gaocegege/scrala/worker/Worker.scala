package com.gaocegege.scrala.worker

import akka.actor.ActorSystem
import com.gaocegege.scrala.core.downloader.impl.HttpDownloader
import akka.actor.Props

object Worker extends App {
  val system = ActorSystem("workerSystem")
  val worker = system actorOf (Props[HttpDownloader], "worker")
  system wait
}
