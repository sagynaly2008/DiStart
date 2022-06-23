package kg.geektech.distart.di

import javax.inject.Inject


class Activity {
    @Inject
  lateinit var monitor: Monitor
  init {
      Component().inject(this)
  }
}