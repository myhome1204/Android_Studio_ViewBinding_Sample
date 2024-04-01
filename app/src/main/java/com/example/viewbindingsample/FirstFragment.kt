package layout

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.viewbindingsample.databinding.FirstfragmentBinding

class firstFragment : Fragment() {
    private lateinit var binding: FirstfragmentBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding = FirstfragmentBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.nameFr.text = "fragment입니다"
        binding.idFr.text = "fragment의 id입니다."
        binding.passwordFr.text = "fragment의 password입니다."
    }


}