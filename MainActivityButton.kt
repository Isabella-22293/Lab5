package uvg.isabella.lab4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import uvg.isabella.lab4.ui.theme.Lab4Theme

class MainActivityButton : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lab4Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Pagina Principal")
                }
            }
        }
    }
}

@Composable
fun Greeting(text: String) {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text("PaginaPricipal")
        Spacer(modifier = Modifier.height(4.dp))
        Button(
            onClick = { navigateToPaginaPrincipal() },
            modifier = Modifier
                .padding(top = 16.dp)
                .fillMaxWidth()
        ) {
            Text("Ir a PaginaPrincipal")
        }

        Text("Perfil")
        Spacer(modifier = Modifier.height(4.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {

        }
    }

    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Text("Configuracion")
        Spacer(modifier = Modifier.height(4.dp))

        Text("Emergencia")
        Spacer(modifier = Modifier.height(4.dp))
        Row(verticalAlignment = Alignment.CenterVertically) {

        }
    }

    @Composable
    @Preview(showBackground = true)
    fun GreetingPreview() {
        Lab4Theme {
            Greeting("Campus Central")
        }
    }
}

