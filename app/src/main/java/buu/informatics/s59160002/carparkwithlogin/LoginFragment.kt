package buu.informatics.s59160002.carparkwithlogin


import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import buu.informatics.s59160002.carparkwithlogin.databinding.FragmentLoginBinding

/**
 * A simple [Fragment] subclass.
 */
class LoginFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = DataBindingUtil.inflate<FragmentLoginBinding>(inflater, R.layout.fragment_login, container, false)

        binding.apply {
            loginBtn.setOnClickListener { view: View ->
                if(usernameTxt.text.toString() == "admin" && passwordTxt.text.toString() == "12345"){
                    view.findNavController().navigate(R.id.action_loginFragment2_to_carParkFragment2)
                }
                Toast.makeText(activity,"Username: admin , Password: 12345", Toast.LENGTH_LONG).show()
            }
        }

        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!, view!!.findNavController() ) || super.onOptionsItemSelected(item)
    }

}
