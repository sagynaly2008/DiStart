package kg.geektech.distart.di

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {

    @Provides
    fun provideMonitor(): Monitor{
        return Monitor()
    }
}