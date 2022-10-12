package ni.edu.uca.navnormanromero

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import ni.edu.uca.navnormanromero.databinding.FragmentCantidadEdadesBinding
import ni.edu.uca.navnormanromero.databinding.FragmentMenuBinding
import ni.edu.uca.navnormanromero.databinding.FragmentNumeroMultiploBinding
import ni.edu.uca.navnormanromero.databinding.FragmentNumerosParesBinding


class menu : Fragment() {

    private lateinit var biinding: FragmentMenuBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        biinding = FragmentMenuBinding.inflate(layoutInflater)
        iniciar()
        return biinding.root
    }

    private fun iniciar() {

        biinding.btnCantidadesEdad.setOnClickListener {
            Navigation.findNavController(biinding.root).navigate(R.id.cantidadEdades)
        }
        biinding.btnNumeroEntero.setOnClickListener {
            Navigation.findNavController(biinding.root).navigate(R.id.numeroMultiplo)
        }
        biinding.btnNumeroPares.setOnClickListener {
            Navigation.findNavController(biinding.root).navigate(R.id.numerosPares)
        }

    }


}