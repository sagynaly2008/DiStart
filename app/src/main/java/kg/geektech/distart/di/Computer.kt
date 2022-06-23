package kg.geektech.distart.di

import javax.inject.Inject

class Computer @Inject constructor (
    val compTower: ComputerTower,
    val keyBoard: KeyBoard,
     val monitor: Monitor
    )