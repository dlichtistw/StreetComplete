package de.westnordost.streetcomplete.quests.railway_electrification

import de.westnordost.streetcomplete.R
import de.westnordost.streetcomplete.quests.AListQuestAnswerFragment
import de.westnordost.streetcomplete.quests.TextItem
import de.westnordost.streetcomplete.quests.railway_electrification.RailwayElectrificationSystem.*

class AddRailwayElectrificationSystemForm :
    AListQuestAnswerFragment<RailwayElectrificationSystem>()
{

    override val items = listOf(
        TextItem(NO, R.string.quest_electrification_no),
        TextItem(CONTACT_LINE, R.string.quest_electrification_overhead),
        TextItem(THIRD_RAIL, R.string.quest_electrification_third_rail),
        TextItem(FOURTH_RAIL, R.string.quest_electrification_fourth_rail),
        TextItem(GROUND_LEVEL, R.string.quest_electrification_ground_level),
    )

}
