package com.example.jetpackcomposeapp.lifecycle

class LifeCycleComposable {

    // https://developer.android.com/develop/ui/compose/lifecycle

    // 1. First annotate our compose with @Composable

    // 2. Understanding Composition
    // - When we load the UI for the first time in compose it is called initial composition
    // - But whenever one of our states changes we load again the ui for compose and we called it recomposition

    // Sample Recomposition or Recompose
    // For example we have a text with state, And when that state change it will automatically
    // reload all of the composable to update the textview value








    // Compasable called multiple Times
    // If we call composable multiple times it will create multiple composable
    // instances each time it was called and each call or instance has it's own lifecycle



    // If the state does not change we will not do recomposition on that specific composable
    // Give example on recomposition with state
    // Use if showError()

    // https://www.youtube.com/watch?v=ctllPATXKhc



    // Recomposition In Lists or Lazy Column
    // When we added a new item on the list in the bottom it will not recomposed, because the item positions did not change
    // But if we gonna add new item in the top or middle it will recomposed because the items position changed


}