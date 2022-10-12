package ni.edu.uca.navnormanromero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import ni.edu.uca.navnormanromero.databinding.FragmentLoginBinding


class login : Fragment() {
    private lateinit var binding: FragmentLoginBinding
    val pwdClave:String = "SomosUCA"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLoginBinding.inflate(layoutInflater)
        iniciar()
        return binding.root
    }
    private fun iniciar() {

        binding.btnIngresar.setOnClickListener {

            val pwdTemp:String = binding.etPw.text.toString()

            if( pwdTemp == pwdClave){
                Navigation.findNavController(binding.root).navigate(R.id.menu)
            }
        }



            }
        }








