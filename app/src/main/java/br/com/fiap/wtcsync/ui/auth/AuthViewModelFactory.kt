package br.com.fiap.wtcsync.ui.auth

import android.app.Application
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import br.com.fiap.wtcsync.WtcSyncApp

class AuthViewModelFactory(
    private val application: Application
) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        val app = application as WtcSyncApp
        @Suppress("UNCHECKED_CAST")
        return AuthViewModel(
            repository = app.authRepository,
            sessionManager = app.sessionManager
        ) as T
    }
}
