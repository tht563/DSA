select ponds.id, 
	sum(
		case 
			when (species.temp_preferences = '+' and ponds.temperature>=species.temp_limit) or (species.temp_preferences = '-' and ponds.temperature<=species.temp_limit) then 1
			else 0
		end
	)
from ducks
left join ponds on ducks.pond_id = ponds.id
left join species on ducks.species_id = species.id
group by ponds.id;